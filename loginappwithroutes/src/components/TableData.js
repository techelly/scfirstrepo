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

  export default function TableData({tableData}){
    return(
        <table className="table">
            <thead>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Phone</th>
                </tr>
            </thead>
            <tbody>
            {
                tableData.map((data, index)=>{
                    return(
                        <tr key={index}>
                            <td>{data.firstName}</td>
                            <td>{data.lastName}</td>
                            <td>{data.email}</td>
                            <td>{data.phone}</td>
                        </tr>
                    )
                })
            }
            </tbody>
        </table>
    )
}

