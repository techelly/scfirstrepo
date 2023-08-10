import {useState} from 'react';
function CustomerForm(){
    const [firstName,setFirstName]=useState("");
    const [lastName,setLastName]=useState("");
    const [email,setEmail]=useState("");

    const handleFirstNameChange=(e)=>{setFirstName(e.target.value)}
    const handleLastNameChange=(e)=>{setLastName(e.target.value)}
    const handleEmailChange=(e)=>{setEmail(e.target.value)}
    const handleSubmit=()=>{;}
    return(
        <div className="container">
            <h1>Add Customer</h1>
            <form onSubmit={handleSubmit} className="form">
                <div className="form-group">
                    <label>First Name</label>
                    <input type="text" name="firstName" className="form-control" value={firstName} onChange={handleFirstNameChange}/>
                    <label>Last Name</label>
                    <input type="text" name="firstName" className="form-control" value={lastName} onChange={handleLastNameChange}/>
                    <label>Email</label>
                    <input type="text" name="firstName" className="form-control" value={email} onChange={handleEmailChange}/>
                </div>
            </form>
        </div>
    );
}

export default CustomerForm;