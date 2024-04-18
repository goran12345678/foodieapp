FROM node:lts-alpine3.19

WORKDIR /usr/src/app

RUN echo "adding git"
RUN apk add git

RUN echo "display git version"
RUN git version

RUN echo "configuring git"
RUN git config --global user.name "Jenkins"
RUN git config --global user.email "webmaster@gmail.com"

RUN echo "cloning git repo"
RUN git clone https://github.com/goran12345678/foodieapp.git

RUN echo "changing to Angular project directory"
WORKDIR /usr/src/app/foodieapp/customerportal

RUN echo "building node modules"
RUN npm install

RUN echo "installing angular cli"
RUN npm install -g @angular/cli

CMD ["ng","serve","--host","0.0.0.0","--port","9191"]


