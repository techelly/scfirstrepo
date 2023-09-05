import {Routes,Route,BrowserRouter} from 'react-router-dom';
import FileUpload from './components/FileUpload';
import Home from './components/Home';
function App() {
  return (
    <main>
      <BrowserRouter>
    
            <Routes>
              <Route path="/" element={<Home />} />
              <Route path="/fileupload" element={<FileUpload/>} />
              
            </Routes>
    
          </BrowserRouter>
      </main>
  );
}

export default App;
