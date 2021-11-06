FROM node:16-alpine as builder

COPY . .

RUN yarn install --frozen-lockfile

RUN yarn build

FROM nginx:alpine

COPY --from=builder build /usr/share/nginx/html
