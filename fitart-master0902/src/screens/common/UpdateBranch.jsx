import React from "react";
import { useState } from "react";
import axios from "axios";
import { url } from "../../common/constant";
import { Link,useHistory } from "react-router-dom";
import { useLocation} from "react-router";
import Logout from '../../screens/common/Logout';

const UpdateBranch = () => {
    const [id, setId] = useState("");
    const [branchName, setbranchName] = useState("");
    const [locality, setLocality] = useState("");
    const [city, setCity] = useState("");
    const [state, setState] = useState("");
    const [zipCode, setZipCode] = useState(0);
    const [phone, setPhone] = useState(0);
    const location = useLocation();
    const branchData = location.state.branches;
    const history = useHistory();


    
    
    
console.log(branchData);
console.log("xxxxxxx");

    const handleUpdate = () => {
        setbranchName(branchData.branchName);
        setLocality(branchData.locality);
        setCity(branchData.city);
        setState(branchData.state);
        setZipCode(branchData.zipCode);
        setPhone(branchData.phone);
        setId(branchData.id);

        const data={
            "id":id,
            "branchName":branchName,
            "locality":locality,
            "city":city,
            "state":state,
            "zipCode":zipCode,
            "phone":phone,

        }
        setId(branchData.id);
        axios.put(url+"/branches/update/"+branchData.id,data).then((response) => {
            const result = response.data;
            if(result.status==="OK"){
                alert("Branch Updated");
                history.push("/allbranches");
            }else{
                alert(" Branch not updated");
            }
        })

    }

    return(
        <div class="privacydiv">

            <Logout/>
            <h2>Update Branch</h2>
            <div className="col-md-6">
                <label htmlFor="">Batch Id</label>   
                <input type="number" className="form-control" value={branchData.id}  readOnly/>
            </div>
            <div className="col-md-6">
                <label htmlFor="">Branch Name</label>
                <input type="text" className="form-control"
                defaultValue={branchData.branchName}
                onChange={(e) => {setbranchName(e.target.value)}}
                required/>
            </div>
            <div className="col-md-6">
                <label htmlFor="">Locality</label>
                <input type="text" className="form-control"
                defaultValue={branchData.locality}
                onChange={(e)=>{setLocality(e.target.value)}}
                required/>
            </div>
            <div className="col-md-6">
                <label htmlFor="">City</label>
                <input type="text" className="form-control"
                defaultValue={branchData.city}
                onChange={(e)=>{setCity(e.target.value)}}
                required/>
            </div>
            <div className="col-md-6">
                <label htmlFor="">State</label>
                <input type="text" className="form-control"
                defaultValue={branchData.state}
                onChange={(e)=>{setState(e.target.value)}}
                required/>
            </div>
            <div className="col-md-6">
                <label htmlFor="">ZipCode</label>
                <input type="number" className="form-control"
                defaultValue={branchData.zipCode}
                onChange={(e)=>{setZipCode(e.target.value)}}
                required/>
            </div>
            <div className="col-md-6">
                <label htmlFor="">Phone</label>
                <input type="number" className="form-control"
                defaultValue={branchData.phone}
                onChange={(e)=>{setPhone(e.target.value)}}
                required/>
            </div>
<hr/>
<hr/>
<hr/>

            
            <div className="mb-3">
                <button className="btn btn-primary" onClick={handleUpdate}>Update</button>
            
            <Link to="/allbranches">
               &nbsp;&nbsp; <button className="btn btn-primary">Back</button>
            </Link>
            </div>
        </div>
    )
}
export default UpdateBranch;    