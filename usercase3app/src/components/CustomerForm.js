import {useState} from 'react';
import TableData from './TableData';
import {Link} from 'react-router-dom';
import CustomerList from './CustomerList';
function CustomerForm(){
    const [customer,setCustomer]=useState(
        {
            firstName:"",
            lastName:"",
            email:"",
            phone:""
        }
    );
    let isFormValid = false;
    let errors ={};
  
    const {firstName,lastName,email,phone}=customer ; //destructring
    const [tableData,setTableData]=useState([]);
  
    const handleChange = (event)=>{
        setCustomer(
            {
                ...customer,[event.target.name]: [event.target.value]
            }
        );
    };

    const handleSubmit =(event)=>{
        event.preventDefault();
        //validateCustomer before doing anything with the data
        validateCustomer();
        //setFormInputDataForDisplay(customer);
        if(isFormValid){
           const newData =(data)=>([...data,customer]);
           setTableData(newData);
            console.log(customer);
        }
        clearForm(event);
       
    };

    const clearForm=(event)=>{
        setCustomer( {
            firstName:"",
            lastName:"",
            email:"",
            phone:""
        });
    }
    const validateCustomer=()=>{
        //logic to validate customer data
       
        if(customer.firstName === ""){
            errors.firstName="First Name cannot be empty";
        }
        if(customer.lastName === ""){
            errors.lastName="Last Name cannot be empty";
        }
        if(customer.email === ""){
            errors.email="Email cannot be empty";
        }
        if(customer.phone === ""){
            errors.phone="Phone cannot be empty";
        }

        const noOfErrors=Object.keys(errors).length;
        if(noOfErrors === 0){ 
            isFormValid=true;
        }
        //setErrors(errors);
    };
    return (
              
        <div className="container">
            <div className="nav-link">
                <Link to="/customerlist" state={tableData}> Back to Customers List</Link>
            </div>
            <h2>Add Customer </h2>
            <form onSubmit={handleSubmit}>
            <div className="form-group">
                
                <label>First Name : </label>
                <input type="text" onChange={handleChange} value={firstName} name="firstName" className="form-control" placeholder="Please enter first name" />
            </div>    
            <div className="form-group">
                <label>Last Name : </label>
                <input type="text" onChange={handleChange} value={lastName} name="lastName" className="form-control" placeholder="Please enter last name" />
            </div> 
            <div className="form-group">
                <label>Email : </label>
                <input type="text" onChange={handleChange} value={email} name="email" className="form-control" placeholder="Please enter email details" />
            </div> 
            <div className="form-group">
                <label>Phone : </label>
                <input type="text" onChange={handleChange} value={phone} name="phone" className="form-control" placeholder="Please enter phone no" />
            </div>
            <div className="form-group"> 
                <input type="submit" name="submit" class="btn btn-info" value="Create Customer"/>
            </div>
                
            
            </form>
            <div>   
        {/** {formInputData.fiFirstName} */}
        
         <TableData tableData={tableData}/>
        {/**<CustomerList tableData={tableData}/>**/}
        </div>  
        
     
        
     </div>
     
    );
}

export default CustomerForm;