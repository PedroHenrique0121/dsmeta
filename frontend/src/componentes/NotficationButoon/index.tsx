import icon from "../../assets/img/notification-icon.svg";

import "./style.css";
function NotiFicationButton() {


    return (
        <div className="dsmeta-red-btn-container">
            <div className="dsmeta-red-btn">
                <img src={icon} alt="Notificar" />
            </div>
        </div>
    )
}

export default NotiFicationButton;
