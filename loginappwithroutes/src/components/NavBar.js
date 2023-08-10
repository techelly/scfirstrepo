import {Link} from 'react-router-dom';
function NavBar(){
    return(
        <div>
            <Link to="/"> Home </Link>
            <Link to="/about"> AboutUs </Link>
            <Link to="/customers"> Customers </Link>
        </div>
    );
}

export default NavBar;