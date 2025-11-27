import pandas as pd
import numpy as np

df = pd.read_csv("C:\\Users\\aleks\\Desktop\\archive\\Movie_Data_File.csv")

data = df['Total_ratings'].dropna().to_numpy()
max_val = np.max(data)
print(max_val)