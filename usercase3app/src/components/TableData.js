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
    let getIndex;
    const toEdit=(e,data,index)=>{
        getIndex=index;
        e.preventDefault();
        
    }
    const toDelete=(e,index)=>{
        e.preventDefault();
    }
    return(
        <div className="container">
        <div>
        <div><caption>Customer Lists</caption></div>
        <table className="table table-bordered">
            
            <thead className="table-dark">
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">First Name</th>
                    <th scope="col">Last Name</th>
                    <th scope="col">Email</th>
                    <th scope="col">Phone</th>
                    <th scope="col">Actions</th>
                </tr>
            </thead>
            <tbody>
            {
                tableData.map((data, index)=>{
                    return(
                        <tr onClick={e=>onCustomerSelect(e,data)} key={index}>
                            <td scoper="row">{index+1}</td>
                            <td>{data.firstName}</td>
                            <td>{data.lastName}</td>
                            <td>{data.email}</td>
                            <td>{data.phone}</td>
                            <td><a href="#"onClick={(e)=>onCustomerSelect(e,data,index)}>Show</a> {' '}
                            <a href="#"onClick={(e)=>toEdit(e,data,index)}>Edit</a> {' '}
                            <a href="#"onClick={(e)=>toDelete(e,index)}>Delete</a></td>{' '}
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