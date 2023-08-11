import {Link} from 'react-router-dom';
import TableData from './TableData';
function CustomerList({tableData}){
    return(
        <div className="container">
            <div>
            <Link to="/customernew">Create new Customer</Link>
            </div>
            <div>   
             <h2>Customers List</h2>
             {/**<TableData tableData={tableData}/>*/}
            </div>
        </div>
    );
}

export default CustomerList;