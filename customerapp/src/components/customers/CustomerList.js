import customers from '../../customers.json';
function CustomerList(){
    const numbers=[1,2,3,4,5];//arrays of numbers
    const listItems = numbers.map((number)=>{return <li>{number}</li>});
    return(
        <>
            <h1>Customers List</h1>
            <ul>{listItems}</ul>
            <p>{JSON.stringify(customers)}</p>
            <table>
                <tbody>
                    {tabRows}
                </tbody>
            </table>
        </>
    );
}

const tabRows= customers.map(
    (customer,i)=>{
        return (
            <tr onClick={(e)=>onCustomerSelect(e,customer)} key={i} >
                <td>customer.id</td>
                <td>customer.firstName</td>
                <td>customer.lastName</td>
                <td>customer.email</td>
            </tr>
        );
    }
);
const onCustomerSelect=(e,customer)=>console.log(customer);

export default CustomerList;