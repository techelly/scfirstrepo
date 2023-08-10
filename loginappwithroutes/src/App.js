import NavBar from './components/NavBar';
import Home from './components/Home';
import AboutUs from './components/AboutUs';
import Customers from './components/Customers';
import CustomerForm from './components/CustomerForm';
import {Routes,Route,BrowserRouter} from 'react-router-dom';

function App() {
  return (
    <main>
      <BrowserRouter>
    
            <Routes>
              <Route path="/" element={<Home />} />
              <Route path="/about" element={<AboutUs/>} />
              <Route path="/customers" element={<Customers/>} />
              <Route path="/customernew" element={<CustomerForm />} />
            </Routes>
    
          </BrowserRouter>
      </main>
  );
}

export default App;
