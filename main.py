import pandas as pd
import csv

data = pd.read_csv(r"data1.csv",encoding='cp949')

cond1 = data['CITY_NAME'] == '포항시'
cond2 = data['CITY_NAME'] =='경주시'
cond3 = data['CITY_NAME'] == '영주시'
cond4 = data['CITY_NAME'] =='상주시'
cond5 = data['CITY_NAME'] == '안동시'
cond6 = data['CITY_NAME'] =='칠곡군'
cond7 = data['CITY_NAME'] == '경산시'
cond8 = data['CITY_NAME'] =='구미시'
cond9 = data['CITY_NAME'] =='김천시'
cond10 = data['CITY_NAME'] == '영천시'
#print(data[cond1 | cond2 | cond3])
user_data =data[cond1 | cond2 |cond3|cond4|cond5|cond7|cond8| cond6 | cond10 |cond9]
#print(user_data['NODE_NM','GPS_LATI','GPS_LONG','CITY_CODE','CITY_NAME'])
df3 = user_data[['NODE_NM','GPS_LATI','GPS_LONG','CITY_CODE','CITY_NAME']]
df3.to_csv('경상북도버스정류장.csv')
