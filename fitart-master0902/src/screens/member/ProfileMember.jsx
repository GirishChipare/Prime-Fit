import React, { useState, useEffect } from "react";
//import {Link} from 'react-router-dom';
import { useParams } from "react-router-dom";
import axios from "axios";
import Logout from '../../screens/common/Logout';
import {useHistory} from 'react-router-dom';
import {Link} from 'react-router-dom';

const User = () => {
  const history = useHistory();
  const [user, setUser] = useState({
    name: "",
    username: "",
    email: "",
    phone: "",
    webiste: ""
  });
  const { id } = useParams();
  useEffect(() => {
    loadUser();
  });
  const loadUser = async () => {
    const res = await axios.get(`http://localhost:3003/users/${id}`);
    setUser(res.data);
  };
  return (
    <div className="privacydiv2">
      <Logout/>
    <div className="container py-4">
      

      <div>
      {/* <Link className="btn btn-primary" to="/">
        back to Home
      </Link> */}
      <h1 className="display-6">
        {/* User Id: {id} */}
        Profile
        
        
        </h1>
      
      <hr />
      <ul className="list-group w-60">
        <li className="list-group-item">Name: {user.name}</li>
        <li className="list-group-item">Email: {user.email}</li>
        <li className="list-group-item">Password: {user.password}</li>
        <li className="list-group-item">Phone: {user.phone}</li>
        <li className="list-group-item">Locality: {user.locality}</li>
        <li className="list-group-item">City: {user.city}</li>
        <li className="list-group-item">State: {user.state}</li>
        <li className="list-group-item">Zipcode: {user.zipcode}</li>
      </ul>
      </div>
      <div>
        <hr/>
        <button type="button" class="btn btn-light" onClick={()=>{
                                 history.push('/updatebatch', {user:user})
                                }}>
                                           Edit
                                        </button>
                                        <Link to="/memberpage">
               &nbsp;&nbsp; <button className="btn btn-primary">Back</button>
            </Link>
      </div>
    </div>

    <hr/>
        <hr/>
        <hr/>
    
    </div>
  );
};

export default User;