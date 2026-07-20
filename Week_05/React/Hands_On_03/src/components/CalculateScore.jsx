import '../styles/Style.css';

function CalculateScore({name, school, total, goal})
{
    const avg = total / goal * 100;
    return(
        <div className = "container">
            <h2>Student Score Card</h2>
            <p className='name'><strong>Name:</strong> {name}</p>
            <p className='school'><strong>School:</strong> {school}</p>
            <p className='total'><strong>Total Marks:</strong> {total}</p>
            <p className='goal'><strong>Goal:</strong> {goal}</p>
            <p className='Avg'><strong>Average:</strong> {avg}%</p>
        </div>
    );
}

export default CalculateScore;