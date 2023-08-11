/**
export default function TableData() {
    // 👇️ the variable stores an array
    const arr = ['bobby', 'hadz', 'com'];
  
    return (
      <div>
        {arr.map((element, index) => {
          return (
            <div key={index}>
              <h2>{element}</h2>
            </div>
          );
        })}
      </div>
    );
  }
   */
import {useState} from 'react';
  export default function TableData({tableData}){
    const [selectedCustomer,setSelectedCustomer]=useState(
        {
            firstName:"",
            lastName:"",
            email:"",
            phone:""
        }
    );
    const onCustomerSelect=(e,data)=>{
        console.log("Selected ---"+data.id);
         setSelectedCustomer(
             {
                 ...data,[e.target.name]:[e.target.value]
             }
         );
    }
    return(
        <div className="container">
        <div>
        <table className="table">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Phone</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
            {
                tableData.map((data, index)=>{
                    return(
                        <tr onClick={e=>onCustomerSelect(e,data)} key={index}>
                            <td>{index+1}</td>
                            <td>{data.firstName}</td>
                            <td>{data.lastName}</td>
                            <td>{data.email}</td>
                            <td>{data.phone}</td>
                            <td>Show Edit Delete</td>
                        </tr>
                    )
                })
            }
            </tbody>
        </table>
        </div>
        <div>
            {selectedCustomer.firstName}
            {selectedCustomer.lastName}
            {selectedCustomer.email}
            {selectedCustomer.phone}
        </div>
        </div>
    );
}