import  pandas as pd
print("TEST")
data=pd.read_excel("input.xlsx")
print(data)
print(data.dtypes)
#test=pd.read_excel("input.xlsx" ,engine="openpyxl")
data.insert(2,"IPRS",[10,12,23],True)
data.to_excel("output.xlsx",sheet_name="pg 0",index=False)
''''=====================================================================
data2=pd.read_excel("test_input.xlsx",skiprows=6)
print(data2[["GRUPA","DATA"]])
'''