import CustomerForm from './customers/CustomerForm';
import CustomerDetails from './customers/CustomerDetails';
import CustomerList from './customers/CustomerList';
function App() {
    return (
        <>
            <p>Customer App</p>
            <CustomerList />
            <CustomerForm />
            <CustomerDetails />
        </>
    );
}

export default App;