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
        <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
        
            <a class="navbar-brand" href="#">TopGunsBank</a>
            <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
            <li class="nav-item"><a class="nav-link"><Link to="/"> Home </Link></a></li>
            <li class="nav-item"><a class="nav-link"><Link to="/about">AboutUs </Link></a></li>
            <li class="nav-item"><a class="nav-link"><Link to="/customerlist">Customers</Link></a></li>
            <li class="nav-item"><a class="nav-link"><Link to="/">SCB </Link></a></li>
            </ul>
            
        </div>
        </nav>
    );
}

export default NavBar;