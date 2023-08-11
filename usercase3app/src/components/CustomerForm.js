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
        <div>
        <div>
        <Link to="/customerlist">Back to Customers List</Link>
            </div>
        <div className="container">
            <h1>Add Customer </h1>
            <form onSubmit={handleSubmit}>
            <div className="form-row row">
                <div className="col">
                <label>First Name : </label>
                <input type="text" onChange={handleChange} value={firstName} name="firstName" className="form-control" placeholder="Please enter first name" />
                </div>    
                <div className="col">
                <label>Last Name : </label>
                <input type="text" onChange={handleChange} value={lastName} name="lastName" className="form-control" placeholder="Please enter last name" />
                </div> 
                <div className="col">
                <label>Email : </label>
                <input type="text" onChange={handleChange} value={email} name="email" className="form-control" placeholder="Please enter email details" />
                </div> 
                <div className="col">
                <label>Phone : </label>
                <input type="text" onChange={handleChange} value={phone} name="phone" className="form-control" placeholder="Please enter phone no" />
                </div>
                <div className="col"> 
                <input type="submit" name="submit" value="Create Customer"/>
                </div>
                
            </div>
            </form>
          
        
     
        </div>
        <div>   
        {/** {formInputData.fiFirstName} */}
         <TableData tableData={tableData}/>
        {/**<CustomerList tableData={tableData}/>**/}
        </div>
     </div>
     
    );
}

export default CustomerForm;