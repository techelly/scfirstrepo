import {useParams,useLocation} from 'react-router-dom';
function Customers(props){
    let { custId } = useParams();
    const location = useLocation();
    const propsData = location.state;
    console.log(propsData);
    return (
        <>
            <h1>Customers</h1>
            <p>Customer Id is : {custId}</p>
            <p>{propsData.firstName}</p>
            <p>{propsData.lastName}</p>
        </>
    );
}

export default Customers;