/**
 * KrabirVPN / Happ: hourly subscription refresh header.
 *
 * Deploy this file as a Cloudflare Worker, then use the Worker URL as the
 * subscription URL in Happ. It proxies the existing JSON unchanged and adds
 * the Happ-supported profile-update-interval response header.
 */
const SOURCE_URL = "https://raw.githubusercontent.com/miroslavuvarov2-a11y/Mod/main/happ.txt";

export default {
  async fetch(request) {
    if (request.method !== "GET" && request.method !== "HEAD") {
      return new Response("Method not allowed", {
        status: 405,
        headers: { "Allow": "GET, HEAD" }
      });
    }

    const upstream = await fetch(SOURCE_URL, {
      headers: { "Accept": "application/json" },
      cf: { cacheTtl: 0, cacheEverything: false }
    });

    const headers = new Headers(upstream.headers);
    headers.set("profile-update-interval", "1");
    headers.set("Cache-Control", "no-store");
    headers.set("Access-Control-Allow-Origin", "*");

    return new Response(
      request.method === "HEAD" ? null : upstream.body,
      { status: upstream.status, statusText: upstream.statusText, headers }
    );
  }
};
