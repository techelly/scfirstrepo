import customers from '../../customers.json';
function CustomerList(){
    const numbers=[1,2,3,4,5];//arrays of numbers
    const listItems = numbers.map((number)=><li>{number}</li>);
    return(
        <>
            <h1>Customers List</h1>
            <ul>{listItems}</ul>
            <p>{JSON.stringify(customers)}</p>
        </>
    );
}

export default CustomerList;