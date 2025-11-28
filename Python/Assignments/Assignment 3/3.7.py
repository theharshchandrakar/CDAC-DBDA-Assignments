import pprint

weather = [
    {'Mumbai': [31, 31, 32]},
    {'Pune': [22, 25, 29]},
    {'Delhi': [26, 30, 34]},
    {'Bengaluru': [20, 23, 27]},
    {'Chennai': [27, 31, 35]},
    {'Kolkata': [26, 29, 33]},
    {'London': [12, 16, 20]},
    {'New York': [15, 19, 24]},
    {'Tokyo': [19, 22, 26]},
    {'Dubai': [32, 35, 41]},
    {'Sydney': [14, 18, 23]}
]
#1. Print the weather data

print("City with max/min temp:")
for city_data in weather:

    for city_name, temps in city_data.items():
        output_string = f"{city_name}: min:{temps[0]}, avg:{temps[1]}, max:{temps[2]}"
        print(output_string)
print("")

# 2. Print the city with maximum/min temp
hottest_city_data = max(weather, key=lambda item: list(item.values())[0][2])

coldest_city_data = min(weather, key=lambda item: list(item.values())[0][0])

hottest_city = list(hottest_city_data.keys())[0]
hottest_temp = list(hottest_city_data.values())[0][2]

coldest_city = list(coldest_city_data.keys())[0]
coldest_temp = list(coldest_city_data.values())[0][0]

print(f"City with highest max temperature: {hottest_city} ({hottest_temp}°C)")
print(f"City with lowest min temperature: {coldest_city} ({coldest_temp}°C)\n")

#3. Print all the cities that experience min temp more than 30 degree

plus30cities = [
    list(city.keys())[0] for city in weather if list(city.values())[0][0] > 30
]

print("Cities with a minimum temperature greater than 30°C: ️")

if plus30cities:
    for city in plus30cities:
        print(city)
else:
    print("No cities found with a minimum temperature above 30°C.")

# 4. Create a dictionary to print 'City':'Avg temp'
avg_temp_dict_comp = {
    list(city.keys())[0]: list(city.values())[0][1] for city in weather
}

print("\nCity with its Avg Temperature:")
pprint.pprint(avg_temp_dict_comp)