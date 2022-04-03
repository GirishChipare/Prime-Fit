import React from "react";
import { useState } from "react";
import axios from "axios";
import { url } from "../../common/constant";
import { Link,useHistory } from "react-router-dom";
import { useLocation} from "react-router";
import Logout from '../../screens/common/Logout';

const UpdateMember = () => {
    const [id, setId] = useState("");
    const [firstName, setFirstName] = useState("");
    const [lastName, setLastName] = useState("");
    const [email, setEmail] = useState("");
    // const [password, setPassword] = useState("");
    const [locality, setLocality] = useState("");
    const [city, setCity] = useState("");
    const [state, setState] = useState("");
    const [zipCode, setZipCode] = useState(0);
    const [phone, setPhone] = useState(0);
    const [branch, setBranch] = useState(0);
    const location = useLocation();
    const memberData = location.state.members;
    const history = useHistory();

    
console.log(memberData);
console.log("xxxxxxx");

    const handleUpdate = () => {

        if (firstName === '' || lastName === '' || email === '' || locality === '' || city === '' || state === '' || zipCode === '' || phone === '' || branch === '') {
            alert("fields cannot be empty");
          } else {
        const data={
            "id":id,
            "firstName":firstName,
            "lastName":lastName,
            "email":email,
            "locality":locality,
            "city":city,
            "state":state,
            "zipCode":zipCode,
            "phone":phone,
            "branch":branch

        }
        setId(memberData.id);
        axios.put(url+"/branches/update/"+memberData.id,data).then((response) => {
            const result = response.data;
            if(result.status==="OK"){
                alert("Member Updated");
                history.push("/mymembers");
            }else{
                alert(" Member not updated");
            }
        })

    }
}

    return(
        <div class="privacydiv">

            <Logout/>
            <h2>Update Member Branch</h2>
            <div className="col-md-6">
                <label htmlFor="">Member Id</label>   
                <input type="number" className="form-control" value={memberData.id}  readOnly/>
            </div>
            <div className="col-md-6">
                <label htmlFor="">First Name</label>
                <input type="text" className="form-control"
                placeholder={memberData.lastName}
                onChange={(e) => {setFirstName(e.target.value)}}
                required
                readOnly/>
            </div>
            <div className="col-md-6">
                <label htmlFor="">Last Name</label>
                <input type="text" className="form-control"
                placeholder={memberData.lastName}
                onChange={(e) => {setLastName(e.target.value)}}
                required
                readOnly/>
            </div>
            <div className="col-md-6">
                <label htmlFor="">Email</label>
                <input type="text" className="form-control"
                placeholder={memberData.email}
                onChange={(e) => {setEmail(e.target.value)}}
                required
                readOnly/>
            </div>
            <div className="col-md-6">
                <label htmlFor="">Locality</label>
                <input type="text" className="form-control"
                placeholder={memberData.locality}
                onChange={(e)=>{setLocality(e.target.value)}}
                required
                readOnly/>
            </div>
            <div className="col-md-6">
                <label htmlFor="">City</label>
                <input type="text" className="form-control"
                placeholder={memberData.city}
                onChange={(e)=>{setCity(e.target.value)}}
                required
                readOnly/>
            </div>
            <div className="col-md-6">
                <label htmlFor="">State</label>
                <input type="text" className="form-control"
                placeholder={memberData.state}
                onChange={(e)=>{setState(e.target.value)}}
                required
                readOnly/>
            </div>
            <div className="col-md-6">
                <label htmlFor="">ZipCode</label>
                <input type="number" className="form-control"
                placeholder={memberData.zipCode}
                onChange={(e)=>{setZipCode(e.target.value)}}
                required
                readOnly/>
            </div>
            <div className="col-md-6">
                <label htmlFor="">Phone</label>
                <input type="number" className="form-control"
                placeholder={memberData.phone}
                onChange={(e)=>{setPhone(e.target.value)}}
                required
                readOnly/>
            </div>
            <div className="col-md-6">
                <label htmlFor="">Branch</label>
                <input type="text" className="form-control"
                placeholder={memberData.branch}
                onChange={(e)=>{setBranch(e.target.value)}}
                required 
                />
            </div>
<hr/>
<hr/>
<hr/>

            
            <div className="mb-3">
                <button className="btn btn-primary" onClick={handleUpdate}>Update</button>
            
            <Link to="/allmembers">
               &nbsp;&nbsp; <button className="btn btn-primary">Back</button>
            </Link>
            </div>
        </div>
    )
}
export default UpdateMember;