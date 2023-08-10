import customers from '../../customers.json';
import {useState} from 'react';
import CustomerDetails from './CustomerDetails';
function CustomerList(props){
    //const numbers=[1,2,3,4,5];//arrays of numbers
    //const listItems = numbers.map((number)=>{return <li>{number}</li>});
    //console.log(typeof customers); //type of customers is object
    //console.log(customers[0]);//at index position zero 
    console.log("*********************************************");
    //converting object into JSON string
    //console.log(JSON.stringify(customers));//transforms it into JSON string
    console.log("*********************************************");
    //console.log(JSON.parse(JSON.stringify(customers)));
    //console.log(JSON.parse(customers));//parse method converts JSON string into JS objects
    //const [selectedCustomer,setSelectedCustomer]=useState({id:"",firstName:"",lastName:"",email:""});
    //const {id,firstName,lastName,email}=selectedCustomer;//destructuring
    const [selectedCustomer,setSelectedCustomer]=useState("");
    //const [selectedCustomer,setSelectedCustomer]=useState([]);
    console.log("customers-----"+customers);
    //const customerDatas = JSON.parse(JSON.stringify(customers));
    //console.log("customerDatas-----"+customerDatas);
    const onCustomerSelect=(e,selectedCustomer)=>{
       console.log("Selected ---"+selectedCustomer.id);
        setSelectedCustomer(
            {
                ...selectedCustomer,[e.target.name]:[e.target.value]
            }
        );
        console.log("Selected after setSelected method ---"+selectedCustomer.id);
        console.log("Selected after setSelected method ---"+JSON.stringify(selectedCustomer));
        };

    const tabRows= customers.map(
        (customer,i)=>{
            console.log("Value of customer ---"+customer.id);
            return (
                <tr onClick={e=>onCustomerSelect(e,customer)} key={i}>
                    <td>{customer.id}</td>
                    <td>{customer.firstName}</td>
                    <td>{customer.lastName}</td>
                    <td>{customer.email}</td>
                </tr>
            );
        }
    );
    return(
        <>
        <div className='container'>
            <h1>Customers List</h1>
            <table className='table table-hover table-bordered table-sm'>
                <thead className='thead-light'>
                    <tr>
                        <th>Id</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                    </tr>
                </thead>
                <tbody>
                    {tabRows}
                </tbody>
            </table>
            <div>
                <CustomerDetails cust = {JSON.stringify(selectedCustomer)}/>
            </div>
        </div>
        
        </>
    );
}


//; setSelectedCustomer(customer)}
export default CustomerList;