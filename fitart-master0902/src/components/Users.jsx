import React, { Component } from 'react';

class Users extends Component {
    constructor(props) {
        super(props);
        this.state = {
            users: []
                    
    }
}
    
    render() {
        return (
            <div>
                <h1 className='text-center'>Users</h1>
                <div className='row'>

                    <table className='table table-striped table-bordered'>

                        <thead>
                            <tr>
                                <th>First Name</th>
                                <th>Last Name</th>
                                <th>Phone</th>
                                <th>Role</th>
                                <th>Email</th>
                                <th>City</th>
                            </tr>
                        </thead>
                        <tbody>
                            {this.state.users.map(user => 
                            <tr key={user.id}>
                                <td>{user.firstName}</td>
                                <td>{user.lastName}</td>
                                <td>{user.phone}</td>
                                <td>{user.role}</td>
                                <td>{user.email}</td>
                                <td>{user.city}</td>
                            </tr>
                            )}
                            </tbody> 
                    </table>
                </div>

                
            </div>
        );
    }
}

export default Users;