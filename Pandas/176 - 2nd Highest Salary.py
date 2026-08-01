data = [[1, 100], [2, 200], [3, 300]]
employee = pd.DataFrame(data, columns=['id', 'salary']).astype({'id':'int64', 'salary':'int64'})

import pandas as pd

def second_highest_salary(employee: pd.DataFrame) -> pd.DataFrame:
    salaries = employee["salary"].drop_duplicates().sort_values(ascending=False)

    if len(salaries) >= 2:
        return pd.DataFrame({"SecondHighestSalary": [salaries.iloc[1]]})
    else:
        return pd.DataFrame({"SecondHighestSalary": [None]})