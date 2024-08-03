BASE_URL = http://localhost:8080/cars/

all: 140

%:
	@echo "Sending GET request to $(BASE_URL)$@..."
	curl -X GET $(BASE_URL)$@

.PHONY: all
