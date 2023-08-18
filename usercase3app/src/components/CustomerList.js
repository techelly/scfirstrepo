import {Link,useLocation} from 'react-router-dom';
import TableData from './TableData';

function CustomerList(props){
    const location = useLocation();
    const propsData=location.tdata;
    console.log(propsData);
    return(
        <div className="container">
            <div>
            <Link to="/customernew">Create new Customer</Link>
            </div>
            <div>   
             <h2>Customers List</h2>
           
             {<TableData tableData={propsData}/>}
            </div>
        </div>
    );
}

export default CustomerList;