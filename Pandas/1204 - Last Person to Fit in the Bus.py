import pandas as pd

def last_passenger(queue: pd.DataFrame) -> pd.DataFrame:
    sorted=queue.sort_values(by='turn').reset_index(drop=True)
    w=0
    for i in range(sorted.shape[0]):
        w+=sorted.loc[i, 'weight']
        if w==1000:
            return pd.DataFrame({'person_name':[sorted.loc[i, 'person_name']]})

        elif w>1000:
            return pd.DataFrame({'person_name':[sorted.loc[i-1, 'person_name']]})

    return pd.DataFrame({'person_name':[sorted.loc[i, 'person_name']]})