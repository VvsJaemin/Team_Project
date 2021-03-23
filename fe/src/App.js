import React, {Component, useState} from 'react'

import Home from './cmm/container/Home'
import {Route} from 'react-router-dom'

class App extends Component {
  constructor(props){
    super(props);
    this.state = {
      selectedFile: null,
    }
  

  return(<>
  
  <h1>Video or Photo Uploading...</h1>
  <Route path='/' component={Home} exact/>
  <form>
    업로드를 시작합니다.<br/>
  <input type="file" name="file" onChange={null} />
  <button type="button" name="choice" onClick={null}/>
  </form>
  
  </>)}
}
export default App