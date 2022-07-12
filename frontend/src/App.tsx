import Header from "./componentes/Header"
import NotiFicationButton from "./componentes/NotficationButoon"
import SalesCard from "./componentes/SalesCard"


function App() {


  return (
    <>


      <Header></Header>
      <main>
        <section id="sales">
          <div className="dsmeta-container">

            <SalesCard></SalesCard>
          </div>
        </section>
      </main>

    </>
  )
}

export default App
