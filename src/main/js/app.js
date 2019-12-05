const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {purchases: []};
    }

    componentDidMount() {
        client({method: 'GET', path: '/api/purchases'}).done(response => {
            this.setState({purchases: response.entity._embeded.purchases});
        });
    }

    render() {
        return (
            <PurchaseList purchases={this.state.purchases}/>
        )
    }
}

class PurchaseList extends React.Component{
    render() {
        const purchases = this.props.purchases.map(purchase =>
            <Purchase key={purchase._links.self.href} purhase={purchase}/>
        );
        return (
            <table>
                <tbody>
                <tr>
                    <th>Name</th>
                    <th>Count</th>
                    <th>Amount</th>
                    <th>Date Purchase</th>
                </tr>
                {purchases}
                </tbody>
            </table>
        )
    }
}

class Purchase extends React.Component{
    render() {
        return (
            <tr>
                <td>{this.props.purchase.namePurhcase}</td>
                <td>{this.props.purchase.countPurchase}</td>
                <td>{this.props.purchase.amountPurchase}</td>
                <td>{this.props.purchase.datePurchase}</td>

            </tr>
        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react')
)