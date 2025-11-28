def make_ing_form(word_list):
    for word in word_list:
        if word.endswith('ie'):
            verb_participle_dict[word] = word[:-2] + 'ying'

        elif word.endswith('e'):
            verb_participle_dict[word] = word[:-1] + 'ing'
        else:
            verb_participle_dict[word] = None

#main
word_list = list(input("Enter verbs separated by space: \n").lower().split())
participle = []
verb_participle_dict = {}
make_ing_form(word_list)
print("{Verb : Present Participle}\n",verb_participle_dict)