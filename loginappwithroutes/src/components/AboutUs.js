import {useLocation} from 'react-router-dom';
function AboutUs(props){
    const location = useLocation();
    const data= location.state.data;
    console.log(props," props");
    console.log(location, " useLocation Hook");
    return (
        <>
            <h1>About Us</h1>
            <p>We are leading Bank worldwide </p>
            <p>{data ? data.title : "Go to Home"}</p>
        </>
    );
}

export default AboutUs;