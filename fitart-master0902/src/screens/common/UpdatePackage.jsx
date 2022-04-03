import React from "react";
import { useState } from "react";
import axios from "axios";
import { url } from "../../common/constant";
import { Link,useHistory } from "react-router-dom";
import { useLocation} from "react-router";
import Logout from '../../screens/common/Logout';

const UpdatePackage = () => {
    // const [packag, setPackage] = useState([])
    const [id, setId] = useState("");
    const [packageName, setpackageName] = useState("");
    const [packagePrice, setpackagePrice] = useState(0.0);
    const [packageDescription, setpackageDescription] = useState("");
    const location = useLocation();
    const packageData = location.state.packag
    const history = useHistory(); 

    

    const handleUpdate = () => {
        if (packageName === '' || packagePrice === '' || packageDescription === '') {
            alert("fields cannot be empty"); 
          } else {
        const data={
            id:id,
            packageName:packageName,
            packagePrice:packagePrice,
            packageDescription:packageDescription

        }
    
        setId(packageData.id);
        axios.put(url+"/packages/update/"+packageData.id,data).then((response) => {
            const result = response.data;
            if(result.status==="OK"){
                alert("Package Updated");
                history.push("/allpackages");
            }else{
                alert("Package not updated");
            }
        })

    }
    }

    return(
        <div class="privacydiv">
            <h2>Update Package</h2>
            <Logout/>
            <div className="col-md-6">
                <label htmlFor="">Package Id</label>   
                <input type="number" className="form-control" value={packageData.id}  readOnly/>
            </div>
            <div className="col-md-6">
                <label htmlFor="">Package Name</label>
                <input type="text" className="form-control"
                defaultValue={packageData.packageName}
                onChange={(e) => {setpackageName(e.target.value)}}
                required/>
            </div>
            <div className="col-md-6">
                <label htmlFor="">Package Price</label>
                <input type="number" className="form-control"
                defaultValue={packageData.packagePrice}
                onChange={(e)=>{setpackagePrice(e.target.value)}}
                required/>
            </div>

            <div className="col-md-6">
                <label htmlFor="">Description</label>
                <input type="text" className="form-control"
                defaultValue={packageData.packageDescription}
                onChange={(e)=>{setpackageDescription(e.target.value)}}
                required/>
            </div>
            <div className="mb-3">
                <button className="btn btn-primary" onClick={handleUpdate}>Update</button>
            
            <Link to="/allpackages">
                <button className="btn btn-primary">Back</button>
            </Link>
            </div>
        </div>
    )
}
export default UpdatePackage;