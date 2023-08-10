import {useState} from 'react';
function CustomerForm(){
    const [customer,setCustomer]=useState(
        {
            firstName:"",
            lastName:"",
            email:"",
            phone:""
        }
    );

    const {firstName,lastName,email,phone}=customer ; //destructring
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
        console.log(customer);
    };

    const validateCustomer=()=>{
        //logic to validate customer data
    };
    return (
        <div className="container">
            <h1>Add New Customer details</h1>
            <form onSubmit={handleSubmit}>
            <div className="form-row row">
                <div className="col">
                <label>First Name : </label>
                <input type="text" onChange={handleChange} value={firstName} name="firstName" className="form-control" placeholder="FirstName" />
                </div>    
                <div className="col">
                <label>Last Name : </label>
                <input type="text" onChange={handleChange} value={lastName} name="lastName" className="form-control" placeholder="LastName" />
                </div> 
                <div className="col">
                <label>Email : </label>
                <input type="text" onChange={handleChange} value={email} name="email" className="form-control" placeholder="Email" />
                </div> 
                <div className="col">
                <label>Phone : </label>
                <input type="text" onChange={handleChange} value={phone} name="phone" className="form-control" placeholder="Phone" />
                </div>
                <div className="col"> 
                <input type="submit" name="submit"/>
                </div>
            </div>
            </form>
        </div>
    );
}

export default CustomerForm;