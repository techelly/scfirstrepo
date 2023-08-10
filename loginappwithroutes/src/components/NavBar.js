import {Link} from 'react-router-dom';
import {useState} from 'react';
function NavBar(){
    const customerData={
        firstName:"Tamanah",
        lastName:"Bhatia",
        movie:"Jailer",
        costar:"Rajni Sir"
    }

    const [data,setData]=useState({
        id:"lt4",
        title:"How to pass state in react-router-dom",
        tag:["reactjs","react-router-dom"]
    });
    
    return(
        <div>
            <Link to="/"> Home </Link>
            <Link to="/about" state={{data: data}}> AboutUs </Link>
            <Link to="/customers/:custId" state={customerData}> Customers </Link>
            <Link to="/customernew">Add New Customer</Link>
        </div>
    );
}

export default NavBar;