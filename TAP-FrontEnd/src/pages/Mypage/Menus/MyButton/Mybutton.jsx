import styles from './Mybutton.module.css';
import { useNavigate } from 'react-router-dom';
const Mybutton=({handleConfirm})=>{
    const navi=useNavigate();
    const handleCancel = () => {
        navi('/mypage');
    }
    return(
        <div className={styles.buttonDiv}>
        <div className={styles.cancel}>
            <button onClick={handleCancel}>취소</button>
        </div>
        <div className={styles.confirm}>
            <button onClick={handleConfirm}>확인</button>
        </div>
    </div>
    )
}
export default Mybutton;