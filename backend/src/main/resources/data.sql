INSERT INTO song (title, artist, link)
SELECT t.title, t.artist, t.link
FROM (
  SELECT 'revolution' AS title, 'The Beatles' AS artist, 'https://www.youtube.com/watch?v=lgpRiWZ7TGo' AS link
  UNION ALL SELECT 'twist and shout', 'The Beatles', 'https://www.youtube.com/watch?v=ZbYW3qlrlHE'
  UNION ALL SELECT 'drive my car', 'The Beatles', 'https://www.youtube.com/watch?v=3qsXuyiyOsA'
  UNION ALL SELECT 'sultan of swing', 'Dire Straits', 'https://www.youtube.com/watch?v=HBNwBoOe8aY'
) AS t
WHERE NOT EXISTS (
  SELECT 1 FROM song s WHERE s.title = t.title AND s.artist = t.artist
);