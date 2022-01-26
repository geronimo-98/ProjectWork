import { BrowserRouter, Route, Routes, Link } from 'react-router-dom'
import { ToastContainer } from 'react-toastify'
import 'react-toastify/dist/ReactToastify.css'
import Signin from './pages/signin/signin';
import SignupUser from './pages/signup/usersignup';
import SignupEmployee from './pages/signup/employeesignup';
import './App.css'
import Home from './pages/customer/home';
import FirstHome from './pages/landing/firsthomepage';

function App() {
  return (
    <div className='container'>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<FirstHome />} />
          <Route path="/signin" element={<Signin />} />
          <Route path="/signupuser" element={<SignupUser />} />
          <Route path="/signupemployee" element={<SignupEmployee />} />
          <Route path="/customerhome" element={<Home />} />
        </Routes>
      </BrowserRouter>
      <ToastContainer theme="colored" />
    </div>
  );
}

export default App;
