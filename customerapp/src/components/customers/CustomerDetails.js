function CustomerDetails(props){
    console.log("***************value of props in customer details************");
    console.log("**************"+(props.cust));
    const custData = JSON.stringify((props.cust));
    console.log(custData);
    //const {id,firstName,lastName,email}=props.cust;//destructuring
    //console.log("id----"+id)
    //console.log(JSON.stringify(props.customer));
    //const custData =JSON.parse(props.customer) ;
    //console.log(typeof custData);
    //console.log(custData);
    //console.log(typeof props.customer);
    return(     
        <>
            <h1>Customer Details</h1>
            {/**<p>Id : {}</p>
           <p>First Name :{props.customer.firstName}</p>
            <p>Last Name :{props.customer.lastName}</p>
    <p>Email :{props.customer.email}</p>*/}
        </>
    );
}

export default CustomerDetails;