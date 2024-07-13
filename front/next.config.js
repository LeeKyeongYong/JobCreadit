/** @type {import('next').NextConfig} */
const nextConfig = {
  basePath: '', // 기본 경로를 빈 문자열로 설정하여 루트 경로를 기본값으로 설정
  async rewrites() {
    return [
      {
        source: '/',
        destination: '/pages', // 루트 경로로 접근 시 /pages로 리다이렉트
      },
    ];
  },
};

module.exports = nextConfig;