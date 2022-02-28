import React, { lazy, Suspense } from 'react';
import {BrowserRouter as Router, Route, Switch } from 'react-router-dom';
//imported browserrouter for routing in a spa and respctive changes in index,js

import ReviewContextProvider from './context/ReviewContext';
import TrainerContextProvider from './context/TrainerContext';
import Lazy from './components/Lazy';
import ErrorPage from './components/ErrorPage';



function App() {
  const Home = lazy(() => import('./components/Home'));
  const FitArmy = lazy(() => import('./components/FitArmy'));
  const Pricing = lazy(() => import('./components/Pricing'));
  const Contact = lazy(() => import('./components/Contact'));
  const About = lazy(() => import('./components/About'));
  const IndividualExpert = lazy(() => import('./components/IndividualExpert'));
  const SignUp = lazy(() => import('./components/SignUp'));
  const PrivacyPolicyScreen= lazy(() => import('./components/PrivacyPolicyScreen'));
  return (
    // <TrainerContextProvider>
    //     <Suspense fallback= {<Lazy/>}>
    //   <Switch>
    //       <Route exact path="/" component={Home} />
    //       <Route path="/home" component={Home} />
    //       <ReviewContextProvider>
    //         <Route path="/fitarmy" component={FitArmy} />
    //       </ReviewContextProvider>
    //       <Route path="/about" component={About} />
    //       <Route path="/price" component={Pricing} />
    //       <Route path="/contact" component={Contact} />
    //       <Route path="/register" component={SignUp} />
    //       <Route path='/error' component={ErrorPage} />
    //       <Route exact path="/staff/:id" component={IndividualExpert} />
    //       <Route component={ErrorPage} />
    //   </Switch>
    //     </Suspense>
    // </TrainerContextProvider>
    <TrainerContextProvider>
      <ReviewContextProvider>
        <Suspense fallback={<Lazy />}>
        <Router>
          <Switch>
            <Route exact path="/" component={Home} />
            <Route path="/home" component={Home} />
            <Route path="/about" component={About} />
            <Route path="/price" component={Pricing} />
            <Route path="/contact" component={Contact} />
            <Route path="/register" component={SignUp} />
            <Route path='/error' component={ErrorPage} />
            <Route exact path="/staff/:id" component={IndividualExpert} />
            <Route path="/fitarmy" component={FitArmy} />
            <Route path="/privacypolicy" component={PrivacyPolicyScreen} />
            <Route component={ErrorPage} />
          </Switch>
          </Router>
        </Suspense>
      </ReviewContextProvider>
    </TrainerContextProvider>
  );
}

export default App;
